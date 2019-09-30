module microbit3 {let walkingSteps = 0
let runningSteps = 0
input.onGesture(Gesture.Shake, function () {
    if (input.acceleration(Dimension.Z) < input.acceleration(Dimension.Y) + input.acceleration(Dimension.X))
        walkingSteps += 1
    if (input.acceleration(Dimension.Z) > input.acceleration(Dimension.X) + input.acceleration(Dimension.Y))
        runningSteps += 1
})
input.onButtonPressed(Button.AB, function () {
    basic.showString("WALKINGSTEPS")
    basic.showNumber(walkingSteps)
    basic.pause(2000)
    basic.showString("RUNNINGSTEPS")
    basic.showNumber(runningSteps)
    basic.pause(2000)
    basic.showString("TOTAL")
    basic.showNumber(walkingSteps + runningSteps)
    if (runningSteps < walkingSteps) {
        basic.showString("RUNMORE")
    }
    if (walkingSteps < runningSteps) {
        basic.showString("GOODJOB")
    }
    basic.clearScreen()
})
}