package com.string.thread;
/**
 * @author Naveen K Wodeyar
 * @date 06-Oct-2024
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CallableExampleTest {

    private ExecutorService executorService;

    @BeforeEach
    public void setUp() {
        executorService = Mockito.mock(ExecutorService.class);
    }

    @Test
    public void testCallable() throws Exception {
        // Arrange
        Callable<Integer> task = () -> {
            Thread.sleep(1000); // Simulating long-running task
            return 42;
        };
        Future<Integer> future = mock(Future.class);
        when(executorService.submit(task)).thenReturn(future);
        when(future.get()).thenReturn(42);

        // Act
        Future<Integer> resultFuture = executorService.submit(task);
        Integer result = resultFuture.get();

        // Assert
        assertEquals(42, result);

        // Verify that the task was submitted
        verify(executorService).submit(task);
    }
}

