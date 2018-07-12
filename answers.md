##Joseph Lombardi
###COMP 271
###Lab 6
####Due 07/11/2018


###Questions

#####Why does FixedArrayQueue require an explicit constructor?
  FixedArrayQueue requires an explicit constructor because when we initiate an instance of that class we have to set our capacity.  


#####What happens when you offer an item to a full FixedArrayQueue?
  When we call our offer method it checks to see if size is equal to capacity.  The the size is equal to capacity, offer returns false.  The result of offer is stored in a boolean result variable in our main method.  If the result variable is false, we print "queue full, " + name + " unable to join");" to the system output.


#####What happens when you poll an empty FixedArrayQueue?

  poll() returns null if our queue is empty.  We store that in our String variable current.  If that value is null we continue to print "no one waiting" to our System output.

#####What is the time and (extra) space complexity of each of the FixedArrayQueue methods?
  offer() - This method has a time complexity of O(1).    We are always setting data[rear] to the object we pass in to offer unless the size is equal to capacity.  This method has a space complexity of O(1).

  peek() - This method's time complexity is O(1).  We are always returning data[front] if the size is not equal to 0.  This method has a space complexity of O(1).

  poll() - This method has a time complexity of O(1).  We always store front into a temp variable and return it unless the size is equal to zero.  This method has a space complexity of O(1).  poll() will always use the same amount of memory when it is called.

  isEmpty() - This method's time complexity is O(1).  We are always returning true or false based on if the size is equal to zero or not.  This method has a space complexity of O(1).

  size() - this method's time complexity is O(1).  We are always returning size.  This method has a space complexity of O(1).

  asList() - The time complexity is O(n) because the we have to copy each element to our ArrayList.  The bigger n is the more we have to copy.  This method's space complexity is O(n).  The bigger the list is the more memory we need to copy it. 
  