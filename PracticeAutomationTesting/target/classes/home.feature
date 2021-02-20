Feature: practice automation feature
Scenario: home page with three sliders
Given user is on main page
When user click show menu
And user click home button
Then user is available with three sliders

Scenario: home page with three arrivals
Given user is on main page
When user click show menu
And user click home button
Then user is available with three arrivals

Scenario: images in arrival should navigate
Given user is on main page
When user click show menu
And user click home button
Then user is available with three arrivals
And arrival image should be clickable and navigable

Scenario: arrivals image description
Given user is on main page
When user click show menu
And user click home button
Then user is available with three arrivals
And arrival image should be clickable and navigable
Then click on description tab
And there should be description regarding book

Scenario: arrivals image reviews
Given user is on main page
When user click show menu
And user click home button
Then user is available with three arrivals
And arrival image should be clickable and navigable
Then click on review tab
And there should be review regarding book



