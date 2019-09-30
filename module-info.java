module microbit4 {input.onGesture(Gesture.Shake, function () {
    hand = Math.randomRange(0, 3)
    if (hand == 0) {
        basic.showLeds(`
            # # # # #
            # . . . #
            # . . . #
            # . . . #
            # # # # #
            `)
    } else if (hand == 1) {
        basic.showLeds(`
            . . . . .
            . # # # .
            . # # # .
            . # # # .
            . . . . .
            `)
    } else {
        basic.showLeds(`
            . . . . #
            . . . # .
            # # # . .
            # . # # .
            # # # . #
            `)
    }
})
input.onButtonPressed(Button.A, function () {
    game.addScore(1)
    basic.pause(1000)
    basic.showString("WINS")
    basic.showNumber(game.score())
})
let hand = 0
hand = 0

}