import time

# Record the start time
start = time.time()

# Loop to print numbers
for i in range(100000):
    print(i)

# Record the end time
end = time.time()

# Calculate time taken in seconds
time_taken = end - start

# Print the result
print(f"Time taken: {time_taken:.2f} seconds")
