Feature: Login Functioality


@Reg @Smoke
Scenario: Verify successful login when username and password correct
Given user lanuch site URL
When  user enter username and password
And click on login button
Then Validate success login