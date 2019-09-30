module microBitWork {
	input.onGesture(Gesture.Shake, function () {
	    for (let ruff = 0; ruff < 5; ruff++) {
	        basic.showString("RUFF")
	    }
	})
	basic.forever(function () {
	    basic.showLeds(`
	        . # . # .
	        . # . # .
	        . . . . .
	        # # # # #
	        . # # # .
	        `)
	    basic.pause(10)
	    basic.showLeds(`
	        . # . # .
	        . # . # .
	        . . . . .
	        . # # # .
	        # # # # #
	        `)
	    basic.pause(10)
}