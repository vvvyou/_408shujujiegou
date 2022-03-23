package com.yjc.algorithm.sort;

/**
 * @author yjc
 * @create 2021-12-14-16:30
 */
public class test {
    public static void main(String[] args) {
        int[] arr=new int[]{3,7,16,10,23,19,21};
        test test = new test();
        test.buildMaxHeap(arr,7);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    // 实现一个构建大顶堆的方法
    public void buildMaxHeap(int[] nums, int heapSize){
        for (int i = heapSize / 2 - 1; i >= 0; i --)
            maxHeapify(nums, i, heapSize);
    }

    // 定义一个调整成大顶堆的方法
    public void maxHeapify(int[] nums, int top, int heapSize){
        // 定义左右子节点
        int left = top * 2 + 1;
        int right = top * 2 + 2;

        // 保存当前最大元素的索引位置
        int largest = top;

        // 比较左右子节点，记录最大元素索引位置
        if (right < heapSize && nums[right] > nums[largest])
            largest = right;
        if (left < heapSize && nums[left] > nums[largest])
            largest = left;

        // 将最大元素换到堆顶
        if ( largest != top ) {
            QuickSort.swap(nums, top, largest);

            // 递归调用，继续下沉
            maxHeapify(nums, largest, heapSize);
        }
    }
}

