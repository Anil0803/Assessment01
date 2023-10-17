const str = prompt("enter a string");
const wordsArr = str.split(" ");

for(let i=0;i<wordsArr.length;i++){
    let temp = wordsArr[i].split('').reverse().join('');
    wordsArr[i]=temp;
}
let rev = wordsArr.join(' ');
console.log(rev);