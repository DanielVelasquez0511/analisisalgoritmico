import random
import time

def bubble_sort(arr):
    for i in range(len(arr) - 1):
        for j in range(len(arr) - i - 1):
            if arr[j] > arr[j + 1]:
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp

def main():
    n = int(input("Enter number of elements: "))
    data = [random.randint(0, 999) for _ in range(n)]

    start_time = time.time()
    bubble_sort(data)
    end_time = time.time()

    duration = (end_time - start_time) * 1000  # convertir a milisegundos

    print("Sorted array (first 10 elements):", data[:min(n, 10)])
    print(f"Execution time: {duration:.2f} ms")

if __name__ == "__main__":
    main()
