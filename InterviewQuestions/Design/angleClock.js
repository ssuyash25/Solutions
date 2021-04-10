// Given hours and Mintes find the angle between both the Needles


function findAngle(h, m){

    const hourAngle = h * 5 * 6;
    const minuteAngle = m * 6;

    return Math.abs(hourAngle-minuteAngle)

}

console.log(findAngle(4, 30)) // 60
console.log(findAngle(5, 25)) // 0
console.log(findAngle(12, 30)) // 180
console.log(findAngle(1, 20))  // 90