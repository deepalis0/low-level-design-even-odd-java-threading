package com.uditagarwal;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class State {
    private FooBar nextToPrint;

    public State(@NonNull final FooBar nextToPrint) {
        this.nextToPrint = nextToPrint;
    }
}
