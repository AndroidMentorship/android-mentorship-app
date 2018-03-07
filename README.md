**Android mentorship v2.0**

*Build status*
[![Nevercode build status](https://app.nevercode.io/api/projects/de98a153-97a2-4eab-9bfe-4ac53d72437e/workflows/0fec983a-5c48-4244-8142-b3deb9ecb520/status_badge.svg?branch=master)](https://app.nevercode.io/#/project/de98a153-97a2-4eab-9bfe-4ac53d72437e/workflow/0fec983a-5c48-4244-8142-b3deb9ecb520/latestBuild?branch=master)

**Please read**
- [Intro doc](https://docs.google.com/document/d/1jJWasAozrD9ulrdzu8bLY6XSc_STlhy2kRsxnubVrZ4/edit?usp=sharing)

**Git**
Check the Intro doc above.

**Git workflow:**

What is a git workflow?

Answer:
[One](https://guides.github.com/introduction/flow/), [Two](http://scottchacon.com/2011/08/31/github-flow.html)

**Workflow for adding features and fixes:**

- `git pull origin master` Update the master branch. 
- `git checkout -b [feature-nameoffeature or fix-nameoffix]` Create a branch off the updated master branch.
- Write feature/fix code.
- `git rebase master` [Rebase](https://www.atlassian.com/git/tutorials/rewriting-history/git-rebase) your branch against the updated `local master` branch, 
this should be done on the branch you created.
- `git push origin [feature-nameoffeature or fix-nameoffix]` Push the fix/feature to the created branch on github.
- Create a [Pull request](https://help.github.com/articles/about-pull-requests/)
- Facilitators `review` and either `merge` into the `master branch` or ask for improvements in code.
