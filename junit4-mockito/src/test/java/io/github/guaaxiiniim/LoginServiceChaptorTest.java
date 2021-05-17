
package io.github.guaaxiiniim;

import io.github.guaaxiiniim.UserForm;
import io.github.guaaxiiniim.LoginService;
import io.github.guaaxiiniim.LoginRepository;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginServiceChaptorTest {

    @InjectMocks
    private LoginService loginService;

    @Mock
    private LoginRepository loginRepository;

    @Captor
    ArgumentCaptor<UserForm> argCaptor;

    private UserForm userForm = new UserForm("foo", "bar");

    @Test
    public void testArgumentCaptor() {
        loginService.login(userForm);
        verify(loginRepository).login(argCaptor.capture());
        assertEquals(userForm, argCaptor.getValue());
    }

}
