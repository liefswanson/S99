object P28 {
  import P10.encode

  def lSort[A](ls:List[List[A]]): List[List[A]] =
    ls sortWith {_.length < _.length}

  def lFreqSort[A](ls:List[List[A]]): List[List[A]] = 
}