package com.company;

public class TokenPassRunner
{
    public static void main(String[] args)
    {
        TokenPass testGame = new TokenPass(10);
        int [] testBoard = testGame.getBoard;
        System.out.println("Constructed a testBoard:");
        for (int i = 0; i < testBoard.length; i++)
        {
            System.out.println(testBoard[i] + " ");
        }
        System.out.println();
        testGame.distributeCurrentPlayerTokens();
        System.out.println("After distributing tokens from player " + testGame.getcurrentPlayer() + ": ");
        for (int i = 0; i < testBoard.length; i++)
        {
            System.out.println(testBoard[i] + " ");
        }
    }
}