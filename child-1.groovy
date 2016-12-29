{ ->
  node('shared-agent') {
    hello 'world (from child-1)'
  }
}
def hello(whom) {
  echo "hello ${whom}"
}
