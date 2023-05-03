
'''
def addBooks(bookList,nameOfBook):
    bookList.append(nameOfBook)

def removeBooks(bookList,nameOfBook):
    bookList.remove(nameOfBook)



books=[]
print(addBooks(books,"Dumb Witness"))
'''

'''
def ableToDrive(age):
    if age<18:
        print("Your are not allowed to drive legally")
    else:
        print("You can drive")


if __name__ == "__main__":
    age = int(input("Enter your age to know that you are allowed to drive or not: "))
    ableToDrive(age)
'''

import random


def func():
    # a=[i.lower() for i in lists]
    
    # d={}
    # for i in lists:
    #     d[i]=lists.count(i)
    for i in range(10):
        yield i

        




def guessNumber(num,winningNumber,guess):
    gameOver = False
    while not gameOver:
        if winningNumber == num:
            print(f"You win and you have taken {guess} guesses to win")
            gameOver=True
        else:
            if num < winningNumber:
                print("Your guess is low")
                guess += 1
                num=int(input("Guess again: "))
                guessNumber(num,winningNumber,guess)

            else:
                print('Too high')
                guess += 1
                num=int(input("Guess again: "))
                guessNumber(num,winningNumber,guess)
                



if __name__ == "__main__":
    winningNumber= random.randint(1,100)
    userGuess = int(input("Enter your Guess: "))
    guess = 1
    guessNumber(userGuess,winningNumber,guess)




def func():
    a= list(range(0,10))
    lists

