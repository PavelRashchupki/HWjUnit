package ru.digitalleague;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AddNewObject.class,
        AddObject.class,
        AddExistObject.class,
        CheckFreePlaces.class,
        RemoveObject.class,
        IsInstock.class

})

public class SuitOfTest {
}
