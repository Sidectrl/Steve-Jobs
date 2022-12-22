"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.findOdd = void 0;
/*export const findOdd = (xs: number[]): number => {
  return Number(
    Object.entries(xs.reduce((acc, item) => {
      acc[item] = acc[item] ? acc[item] + 1 : 1
      return acc;
    }, {} as Record<number, number>)
    ).reduce(
      (acc, item) => {
        if (item[1] % 2 === 1 && item[1] > acc.max) {
          return {
            key: item[0],
            max: item[1],
          };
        }
        return acc;
      }, { max: 0, key: "" }
    ).key
  );
};*/
const findOdd = (xs) => {
    // happy coding!
    return xs.reduce((a, b) => a ^ b);
};
exports.findOdd = findOdd;