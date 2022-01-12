package edu.knoldus
import scala.annotation.tailrec

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    @tailrec
    def innerBinarySearch(array: Array[Int], elem: Int, first: Int, last: Int): Boolean = {
      if (elem > array(last)) false
      else {
        val mid = (first + last) / 2
        if (elem == array(mid)) true
        else if (elem < array(mid)) innerBinarySearch(array, elem, first, mid - 1)
        else innerBinarySearch(array, elem, mid + 1, last)
      }
    }

    innerBinarySearch(array, elem, 0, array.length-1)

  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    @tailrec
    def innerLinear(array: Array[Int], elem: Int, i: Int): Boolean = {
      if(i > array.length - 1) false
      else if(array(i) == elem) true
      else innerLinear(array, elem, i + 1)
    }
    innerLinear(array, elem, i = 0)

  }

}
