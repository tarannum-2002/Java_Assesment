So I have implemented a Hashmap to keep track of all the unique letters of the Stirng.

It goes through a loop and there are 2 cases:
if it the element is not present in the hashmap it means it is aunique element
Hence I increase the count

If the element is present in the hashmap, it is repeated now
So the larger gets the value of count if larger < count 
and we get the index of the repeated element from the hashmap 
we clear the map 
we run the loop from that index value now

at the end, 
if larger<count we assign larger the value of count 
and return larger
                
                
