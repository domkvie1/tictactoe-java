# Tic-Tac-Toe (Java)

A two-player, command-line Tic-Tac-Toe game written in Java.

## Features
- Two players (X and O) alternate turns
- Win detection for rows, columns, and both diagonals
- Draw detection when the board fills with no winner
- Input validation: rejects out-of-range moves, occupied spots, and non-numeric input

## Requirements
- JDK 17 or newer

## How to run
```
javac TicTacToe.java
java TicTacToe
```

## How to play
Enter a row and a column (each 0 to 2), separated by a space. For example, `1 1` places your mark in the center.

```
X | O |
--+---+--
  | X |
--+---+--
O |   |
```

## What I learned
- 2D arrays and nested loops
- Game loops and turn management
- Separating logic into methods (`printBoard`, `checkWin`)
- Handling bad user input with `Scanner`
