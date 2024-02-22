u1 = input("Player 1: Enter R for Rock, P for Paper, or S for Scissors: ").lower()
u2 = input("Player 2: Enter R for Rock, P for Paper, or S for Scissors: ").lower()

if u1 == u2:
    print("Tie")
else:
    if u1 == 'r':
        if u2 == 'p':
            print("Paper Wins")
        else:
            print("Rock Wins")
    elif u1 == 'p':
        if u2 == 's':
            print("Scissors Wins")
        else:
            print("Paper Wins")
    elif u1 == 's':
        if u2 == 'r':
            print("Rock Wins")
        else:
            print("Scissors Wins")
    else:
        print("Invalid input! Please enter R, P, or S.")
