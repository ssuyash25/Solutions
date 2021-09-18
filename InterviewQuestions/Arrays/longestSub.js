//  length of longest substring without repeating characters 

function longestSub(s){
    let longest = 0
    // window approach - two pointers
    let i=0; j=1; 
    // i -> begining ; j -> end

    while(j < s.length){
        console.log(i , "  ", j)
        if(noRepeat(s, i, j))
        j++;
        else{
            if(longest < j-i){
                longest =  j-i;
            }
            i++;
        }
    }
    if(longest < (j-1)-i){
        longest =  j-i;
    }
    // till no repeat j++
    // repeat i++
    return longest;
}

function noRepeat(s, i , j){
    let flag = true;
    for(let z = i; z< j; z++){
        if(s[z] === s[j]){
            console.log( "is repeat")
            flag = false;
            break;
        }
    }
    return flag;
}


console.log(longestSub1("ASSDEEFGTZ"));

function longestSub1(s){
    let longest = 0
    // window approach - two pointers
    let i=0; j=1; 
    // i -> begining ; j -> end
    let hashset = new Set();
    hashset.add(s[i]);

    while(j < s.length){
        console.log(i , "  ", j)
        if(!hashset.has(s[j])){
            hashset.add(s[j]);
            j++;
        }
        else{
            if(longest < j-i){
                longest =  j-i;
            }
            i++;
        }
    }
    if(longest < (j-1)-i){
        longest =  j-i;
    }
    // till no repeat j++
    // repeat i++
    return longest;
}