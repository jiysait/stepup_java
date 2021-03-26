package game.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *       |---|---|---|
 *       | 1 | 2 | 3 |
 *       |-----------|
 *       | 4 | 5 | 6 |
 *       |-----------|
 *       | 7 | 8 | 9 |
 *       |---|---|---|
 *
 *       Constraint
 *       1. Use one dimensional array
 *
 *     - Both the players choose either X or O to mark their cells.
 *     - There will be a 3×3 grid with numbers assigned to each of the 9 cells.
 *     - The player who chose X begins to play first.
 *     - He enters the cell number where he wishes to place X.
 *     - Now, both O and X play alternatively until any one of the two wins.
 *     - Winning criteria: Whenever any of the two players has fully filled one row/ column/ diagonal with his symbol (X/ O), he wins and the game ends.
 *     - If neither of the two players wins, the game is said to have ended in a draw.
 *
 *  Winner cases:
 *      Left
 *      Right
 *      Draw
 */

public class TicTacToe {

    // A board doesn't need to be two dimensional arry
    // This is because
    private String[] board;
    private int size;

    private Player whoIsPlaying;
    private int turnCounter;
    private boolean isPlaying;

    private enum Player {
        LEFT,
        RIGHT
    }

    private enum State {
        LWON,
        RWON,
        DRAW,
        CONTINUE,
        ABORTED
    }

    public TicTacToe(int size) {
        setSize(size);
        setBoard();
        setTurnCounter(1);
        setPlaying(true);
    }

    private void setBoard() {
        this.board = new String[this.size];
        for(int i = 0; i < this.size; i++) {
            this.board[i] = i + 1 + "";
        }
    }

    private void setTurnCounter(int turnCounter) {
        this.turnCounter = turnCounter;
    }

    private void setWhoIsPlaying(Player player) {
        this.whoIsPlaying = player;
    }

    public void setSize(int size) {
        this.size = size * size;
    }

    private void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    private void drawBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + this.board[0] + " | " + this.board[1] + " | " + this.board[2] + " | ");
        System.out.println("|-----------|");
        System.out.println("| " + this.board[3] + " | " + this.board[4] + " | " + this.board[5] + " | ");
        System.out.println("|-----------|");
        System.out.println("| " + this.board[6] + " | " + this.board[7] + " | " + this.board[8] + " | ");
        System.out.println("|---|---|---|");
    }

    private void resetBoard() {
        setBoard();
    }

    private State checkWinner() {
        int wayOfCheck = 8; // 가로 3줄, 세로 3줄, 대각선 2줄
        for(int i = 0; i < wayOfCheck; i++) {
            String line = null;
            switch (i) {
                case 0:
                    line = this.board[0] + this.board[1] + this.board[2];
                    break;
                case 1:
                    line = this.board[3] + this.board[4] + this.board[5];
                    break;
                case 2:
                    line = this.board[6] + this.board[7] + this.board[8];
                    break;
                case 3:
                    line = this.board[0] + this.board[3] + this.board[6];
                    break;
                case 4:
                    line = this.board[1] + this.board[4] + this.board[7];
                    break;
                case 5:
                    line = this.board[2] + this.board[5] + this.board[8];
                    break;
                case 6:
                    // 역대각
                    line = this.board[0] + this.board[4] + this.board[8];
                    break;
                case 7:
                    // 정대각
                    line = this.board[2] + this.board[4] + this.board[6];
                    break;
            }

            if(line.equals("XXX")) {
                return State.LWON;
            } else if (line.equals("OOO")) {
                return State.RWON;
            }
        }
        for(int i = 0; i < this.board.length; i++) {
            if(Arrays.asList(this.board).contains(String.valueOf(i + 1))) {
                // keep playing because there are still numbers remaining in the board.
                return State.CONTINUE;
            } else if(i == this.board.length - 1) {
                // draw
                return State.DRAW;
            }
        }
        return State.CONTINUE;
    }

    private State setSlot(int num) {
        // 조금 맵핑에 대해 생각해 볼 필요가 있음
//        int row = (num - 1) / rows;
//        int col = (num - 1) % cols;
        if(!this.board[num - 1].equals("X") && !this.board[num - 1].equals("O")) {
            if (this.whoIsPlaying == Player.LEFT) {
                this.board[num - 1] = "X";
            } else {
                this.board[num - 1] = "O";
            }
        } else {
            System.out.println("Select another slot to continue playing");
            // need to fix
            return State.ABORTED;
        }
        return checkWinner();
    }

    public void run() {
        drawBoard();
        while(isPlaying) {
            System.out.println("Current turn count " + this.turnCounter);
            if(this.turnCounter % 2 == 0) {
                setWhoIsPlaying(Player.RIGHT);
            } else {
                setWhoIsPlaying(Player.LEFT);
            }
            try {
                System.out.println("Enter a slot number to place " + this.whoIsPlaying + " in:");
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String s = bufferRead.readLine();
                if(s.trim().equals("quit")) {
                    System.out.println("now terminating...");
                    bufferRead.close();
                    break;
                }

                int slot = Integer.parseInt(s);
                if(slot > 0 && slot <= this.size) {
                    if(setSlot(slot) != State.CONTINUE) {
                        if(setSlot(slot) == State.DRAW) {
                            System.out.println("Draw");
                        } else {
                            System.out.println("Winner: " + this.whoIsPlaying);
                        }
                        drawBoard();
                        break;
                    } else {
                        drawBoard();
                    }
                } else {
                    System.out.println("Invalid number to play");
                }

            } catch(IOException e) {
                e.printStackTrace();
            } finally {
                setTurnCounter(this.turnCounter + 1);
            }
        }
        System.exit(0);
    }

}
