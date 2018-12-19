package com.company;

public class TokenPass
{
    private int[] board;
    private int currentPlayer;
    private int i;
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        this.currentPlayer = ((int)Math.random() * playerCount);
        for (i = 0; i < playerCount; i++)
        {
            board[i] = ((int)Math.random() * 10) + 1;
        }
    }
    public void distributeCurrentPlayerTokens()
    {
        int n = board[currentPlayer];
        board[currentPlayer] = 0;
        for (int i = currentPlayer + 1; i < board.length; i++)
        {
            if (n > 0)
            {
                board[i] = board[i] + 1;
                n--;
            }
        }
        while (n > 0)
        {
            for (int i = 0; i < board.length; i++)
            {
                if (n > 0)
                {
                    board[i] = board[i] + 1;
                    n--;
                }
            }
        }
    }
}
