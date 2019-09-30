module microbit8 {input.onGesture(Gesture.Shake, function () {
    coinHeadA2 = Math.randomBoolean()
    coinHeadB2 = Math.randomBoolean()
    if (coinHeadA2 == coinHeadB2) {
        basic.showLeds(`
            . . # . .
            . # . # .
            . # # # .
            . # . # .
            . # . # .
            `)
        basic.pause(1000)
        playerOneScore += 1
    } else {
        basic.showLeds(`
            # # # # .
            # . . . #
            # # # # #
            # . . . #
            # # # # .
            `)
        basic.pause(1000)
        playerTwoScore += 1
    }
    basic.showLeds(`
        . # . . .
        # # # . .
        . # . # .
        . . # # #
        . . . # .
        `)
})
input.onButtonPressed(Button.A, function () {
    coinHeadB3 = true
    coinheadA = true
    basic.showString("A")
    basic.showNumber(playerOneScore)
    basic.showString("B")
    basic.showNumber(playerTwoScore)
    basic.showLeds(`
        . # . . .
        # # # . .
        . # . # .
        . . # # #
        . . . # .
        `)
})
let coinHeadB3 = false
let playerTwoScore = 0
let playerOneScore = 0
let coinHeadB2 = false
let coinHeadA2 = false
let coinheadA = false
coinheadA = false
let coinHeadB = false
basic.showLeds(`
    . # . . .
    # # # . .
    . # . # .
    . . # # #
    . . . # .
    `)

}