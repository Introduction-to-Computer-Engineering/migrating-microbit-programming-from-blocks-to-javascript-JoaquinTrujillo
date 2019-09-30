module microbit6 {input.onButtonPressed(Button.A, function () {
    for (let i = 0; i < 1; i++) {
        runner.changeXBy(1)
    }
    basic.pause(2000)
})
input.onButtonPressed(Button.B, function () {
    for (let i = 0; i < 1; i++) {
        runner.changeYBy(-1)
    }
    basic.pause(2000)
})
input.onButtonPressed(Button.AB, function () {
    for (let i = 0; i < 1; i++) {
        runner.changeYBy(1)
        runner.changeXBy(-1)
    }
    playerScore += 1
    basic.pause(2000)
})
input.onGesture(Gesture.Shake, function () {
    basic.showLeds(`
            # # # # #
            # # # # #
            # # # # #
            # # # # #
            # # # # #
            `)
    basic.showString("SCORE")
    basic.showNumber(playerScore)
})
let playerScore = 0
let seconds = 0
let runner2 = null
let runner = game.createSprite(2, 5)
basic.showString("MINEFIELD")
basic.forever(function () {
    basic.showLeds(`
        # . # . #
        . . . . .
        . . . # .
        # . . . .
        . . . . #
        `)
})
}