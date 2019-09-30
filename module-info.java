module microbit12 {let playerScore = 0
let videoGame: game.LedSprite = null
let jumperMan = game.createSprite(2, 4)
basic.showString("RUN")
for (let i = 0; i < 10; ++i) {
    led.toggle(Math.randomRange(0, 4), Math.randomRange(4, 0))
    basic.pause(200)
    led.toggle(Math.randomRange(0, 4), Math.randomRange(4, 0))
    basic.pause(200)
    led.toggle(Math.randomRange(0, 4), Math.randomRange(4, 0))
    basic.pause(200)
    led.toggle(Math.randomRange(0, 4), Math.randomRange(4, 0))
    basic.pause(200)
    led.toggle(Math.randomRange(0, 4), Math.randomRange(4, 0))
    basic.pause(200)
    led.toggle(Math.randomRange(0, 4), Math.randomRange(4, 0))
    basic.pause(200)
    led.toggle(Math.randomRange(0, 4), Math.randomRange(4, 0))
    basic.pause(200)
    led.toggle(Math.randomRange(0, 4), Math.randomRange(4, 0))
    basic.pause(200)
} basic.showString("A+B2START")
input.onButtonPressed(Button.A, function () {
    jumperMan.move(1)
    playerScore += 1
})
input.onButtonPressed(Button.B, function () {
    jumperMan.move(-1)
    playerScore += 1
})
input.onGesture(Gesture.Shake, function () {
    if (playerScore < 100) {
        basic.showString("TRYAGAIN")
        basic.showNumber(playerScore)
    } else {
        basic.showString("WINNER")
        basic.showNumber(playerScore)
    }
    playerScore = 0
})
input.onButtonPressed(Button.AB, function () {
    for (let i = 0; i < 100; ++i) {
        basic.showLeds(`
    . # . # .
    . . . . . 
    # . # . .
    . . . . .
    . # . # .
    `)
        basic.pause(200)
        basic.showLeds(`
    . . . . .
    . # . # .
    . . . . .
    # . # . #
    . . . . .
    `)
        basic.pause(200)
        basic.showLeds(`
    # . # . #
    . . . . .
    . # . # .
    . . . . . 
    # . # . # 
    `)
        basic.pause(200)
    }

})

}