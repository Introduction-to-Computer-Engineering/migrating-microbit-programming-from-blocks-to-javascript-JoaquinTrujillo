module microbit5 {let boxman2 = game.createSprite(0, 0) 
let boxman: game.LedSprite = null
input.onButtonPressed(Button.A, function () {
    for (let i = 0; i < 8; i++){
        boxman2.move (4)
        boxman2.turn(Direction.Right, 90)
        basic.pause(100)
    }
})
input.onButtonPressed(Button.B, function (){
    for(let i = 0; i < 8; ++i) {
        boxman2.move(4)
        boxman2.turn(Direction.Left, 90)
        basic.pause(100)
    }
})
input.onButtonPressed(Button.AB, function(){
    for(let i =0; i<1; ++i){
        boxman2.move(1)
        boxman2.turn(Direction.Right, 18)
    }
})
}