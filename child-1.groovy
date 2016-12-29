{ ->
  node {
    hello 'world (from child-1)'
  }
}
def hello(whom) {
  echo "hello ${whom}"
}
