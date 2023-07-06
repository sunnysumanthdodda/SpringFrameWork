package com.springframework.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class DependencyInjectionConstructorBased {
    Dependency1 dependency1;

    Dependency2 dependency2;
    @Autowired
    public DependencyInjectionConstructorBased(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}
