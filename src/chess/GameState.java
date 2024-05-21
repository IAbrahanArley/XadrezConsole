package chess;

public interface GameState {
    void start();
    boolean testCheck(Color color);
    boolean testCheckMate(Color color);
    boolean[][] possibleMoves(ChessPosition sourcePosition);
    
    
}