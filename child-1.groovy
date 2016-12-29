{ ->
  node('shared-agent-1') {
    hello 'world (from child-1)'
  }
}
def hello(whom) {
  echo "hello ${whom}"
}
