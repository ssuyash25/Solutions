// )(()())(())())))(((()))))

function test(s){
    let a = []
    let i =0; let maxLen =0;
    while(i < s.length){
        if(s[i] === '('){
            a.push(i)
        }else if(s[i] === ')'){
            a.pop();
            //found a complete valid combo and calculate max length
            if (stack.isEmpty()) 
                maxLen = Math.max(maxLen, i - last);
            else
            //calculate current max length
                maxLen = Math.max(maxLen, i - a.peek());
        }
        i++;
    }
    console.log(max+1)
}

test("()(()))))")


