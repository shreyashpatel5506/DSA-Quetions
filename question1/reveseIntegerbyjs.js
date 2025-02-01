let number = 12345;

const reverseNumber = function (number) {
  let reversedNumber = 0;
  while (number > 0) {
    reversedNumber = reversedNumber * 10 + (number % 10);
  }
};
