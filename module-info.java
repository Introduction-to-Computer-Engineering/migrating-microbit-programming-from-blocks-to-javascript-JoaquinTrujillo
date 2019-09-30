module microbit11 {let index = 0
let arrayWords: string[] = []
index = 0
arrayWords = ["Dog", "Dinosuar", "Teacher", "Coding", "Rabbit", "Car"]
basic.showLeds(`
. # # # .
. . . # .
. . # . . 
. . . . .
. . # . .`)
basic.pause(100)
basic.showNumber(1)
basic.pause(100)
basic.showNumber(2)
basic.pause(100)
basic.showNumber(3)
basic.pause(100)
basic.showString(arrayWords[index])
input.onGesture(Gesture.ScreenDown, () => {
    basic.showString(arrayWords[index])
})
input.onGesture(Gesture.ScreenDown, () => {
    led.stopAnimation()
    basic.clearScreen()
    if (index < arrayWords.length - 1) {
        index += 1
    }
    else {
        game.gameOver()
    }
})
}