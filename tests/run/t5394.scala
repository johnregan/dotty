object Test extends dotty.runtime.LegacyApp {
  def f[T](l: List[T]): Int = l match { case x :: xs => f(xs) case Nil => 0 }
  f(List.fill(10000)(0))
}
