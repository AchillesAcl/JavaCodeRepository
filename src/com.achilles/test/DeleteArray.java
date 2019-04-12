package com.achilles.test;


class DeleteArray {
    /**
     * 遍历删除数组
     *
     * @param index 要删除的元素索引
     * @param array 被操作的数组
     * @return 返回删除后的数组
     */
    int[] deleteArrayElement(int index, int[] array) {
        int[] arrNew = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (i < index) {
                arrNew[i] = array[i];
            } else {
                arrNew[i] = array[i + 1];
            }
        }
        return arrNew;
    }
}
