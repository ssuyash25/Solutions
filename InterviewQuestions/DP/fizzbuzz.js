
function test(n){
    for(let i=1; i<n; i++){
        if(i % 5==0){
        if(i % 3==0)
        console.log('fizz buzz')
        else
        console.log('buzz')}
        else if(i % 3==0){
        console.log('fizz')}
        else
        console.log(i)
    }
}

function test(n){
    for(let i=1; i<n; i++){
        if(i % 3==0){
            console.log('fizz')}
            else if(i % 5==0){
            console.log('buzz')}
            else if(i % 3*5==0){
        console.log('fizz buzz')}
        console.log(i)
    }
}

test(16)
