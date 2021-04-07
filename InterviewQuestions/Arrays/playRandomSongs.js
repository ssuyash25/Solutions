// [1,2,3,4,5,6,7,8,9,10]

function playRandom(a,l){
    if(l < 0 ) return a[0];
    let randomSongNo = Math.floor(l * Math.random());
    console.log('Playing song', a[randomSongNo])
    //move song to the end
    let swap = a[randomSongNo];
    a[randomSongNo] = a[l];
    a[l] = swap
    playRandom(a,l-1)
}

playRandom([1,2,3,4,5,6,7,8,9,10],9)
