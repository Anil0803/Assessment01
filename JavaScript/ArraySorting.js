function sortArray() {
 
    var tempArr = prompt("Enter numbers separated by commas:");
    var arr = tempArr.split(',').map(function (item) {
      return parseFloat(item);
    });
  
    var n = arr.length;
    for (var i = 0; i < n - 1; i++) {
      for (var j = 0; j < n - i - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          var temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    console.log('Sorted Array: ' + arr);
  }
  
  sortArray();