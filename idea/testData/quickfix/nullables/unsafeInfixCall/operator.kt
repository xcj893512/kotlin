// "Replace with safe (?.) call" "true"
// ERROR: Infix call corresponds to a dot-qualified call 'value?.compareTo(1).compareTo(0)' which is not allowed on a nullable receiver 'value?.compareTo(1)'. Use '?.'-qualified call instead
var foo: Int? = null
    set(value) {
        if((value <caret>< 1) ?: false) {
        }
    }