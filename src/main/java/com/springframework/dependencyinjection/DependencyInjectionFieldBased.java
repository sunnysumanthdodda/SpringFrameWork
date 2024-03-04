package com.springframework.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
class DependencyInjectionFieldBased {

    Dependency1 dependency1;

    Dependency2 dependency2;

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}
