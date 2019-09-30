module microbit9 {let binary = ""
let decimal = 0
input.onButtonPressed(Button.A, () => {
    binary = binary + "1"
    basic.showString("BINARY+1")
    decimal = decimal * 2 + 1
})
input.onButtonPressed(Button.AB, () => {
    basic.showNumber(decimal)
})
input.onButtonPressed(Button.B, () => {
    binary = binary + "0"
    basic.showString("BINARY+0")
    decimal = decimal * 2
})
input.onGesture(Gesture.Shake, () => {
    binary = "0"
    decimal = 0
    basic.showString("CLEAR")
})
}