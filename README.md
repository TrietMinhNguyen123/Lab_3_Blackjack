# Lab Assignment 3 — A Deck of Cards

**COMP 1050 — Computer Science II**  
**Estimated time:** 90 minutes

You may use any Java IDE, but class demonstrations and support will use IntelliJ IDEA. Implement `Card`, `Deck`, and `Main` in `src/main/java`. Do not change class names, method names, parameter types, return types, or required output text.

## Required behavior

- `Card` stores a rank and suit, provides a constructor and getters, and formats itself as `Rank of Suit`.
- `Deck` creates the standard 52 unique cards using ranks `2`–`10`, `Jack`, `Queen`, `King`, `Ace` and suits `Hearts`, `Diamonds`, `Clubs`, `Spades`.
- `getSize()` returns the number of undealt cards.
- `shuffle()` must call `Collections.shuffle`.
- `dealCard()` removes and returns the card at index 0, or returns `null` if empty.
- `dealCards(int n)` returns a new `ArrayList<Card>` of dealt cards. It throws `IllegalArgumentException` when `n < 0` or `n` exceeds the remaining deck size.
- `Main` shuffles a new deck, prompts for 0–52 cards, and prints each dealt card on its own line. Non-integer or out-of-range input prints the required error message.

## Open and test in IntelliJ IDEA

1. Extract the ZIP; do not edit inside the compressed file.
2. In IntelliJ, choose **File → Open** and select the extracted folder containing `pom.xml`.
3. If asked, choose **Trust Project** and **Load Maven Project**.
4. Select JDK 17 or newer in **File → Project Structure → Project SDK**.
5. Run `DeckTest` under `src/test/java`, then run `Main`.

## Submission checklist

- All TODOs are completed and the provided tests pass.
- `GITHUB_SUBMISSION.txt` contains your real GitHub username and repository URL.
- Your latest work is committed and pushed to the `main` branch.
- Submit to Gradescope using the **GitHub** option and select the correct repository/branch.
- Verify Gradescope shows all four required files: `Card.java`, `Deck.java`, `Main.java`, and `GITHUB_SUBMISSION.txt`.
