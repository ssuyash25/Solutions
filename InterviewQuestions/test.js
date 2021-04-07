

const input = [1, 2, 3];

function swap(array, indexOne, indexTwo) {
    temp = array[indexOne];
    array[indexOne] = array[indexTwo];
    array[indexTwo] = temp;
}
function getPermutations(input, ans = [], index = 0) {
    if (index === input.length - 1) {
        ans.push([...input]);
        return;
    }
    const seenSet = new Set();

    for (let i = index; i < input.length; i++) {
        if (seenSet.has(input[i])) continue;

        swap(input, i, index);
        getPermutations(input, ans, index + 1);
        swap(input, i, index);
        seenSet.add(input[i])
    }
}





// 123
// print all subsets in sorted order
// 1
// 12
// 123
// 13
// 2
// 23
// 3

function getSubsets(input, mainAnswer) {

    for (let i = 0; i < input.length; i++) {
        const answer = [];
        answer.push(input[i]);

        generateSubsets(i+1, input, answer, mainAnswer);
    }
}

function generateSubsets(index, input, answer, mainAnswer) {
    mainAnswer.push([...answer]);

    for(let i = index ; i< input.length ; i++) {
        answer.push(input[i]);

        generateSubsets(i+1, input, answer, mainAnswer);

        answer.pop()
    }
}


const ans = []
getPermutations(input, ans);
 //getSubsets(input, ans);

console.log(ans);