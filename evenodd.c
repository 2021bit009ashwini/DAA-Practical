def separate_odd_even(arr, odd=[], even=[], index=0):
    # Base case: check if the index is out of bounds
    if index == len(arr):
        return odd, even
    
    # Recursive case: check if the current element is odd or even
    current_element = arr[index]
    if current_element % 2 == 0:
        even.append(current_element)
    else:
        odd.append(current_element)
    
    # Move to the next index
    return separate_odd_even(arr, odd, even, index + 1)

# Example usage:
input_array = [1, 2, 3, 4, 5, 6, 7, 8, 9]
odd_elements, even_elements = separate_odd_even(input_array)

print("Odd elements:", odd_elements)
print("Even elements:", even_elements)
