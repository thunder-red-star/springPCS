if ! command -v firefox &> /dev/null
then
  echo "Unable to find firefox..."
  echo "Please use whatever web browser you have and go to https://docs.google.com/presentation/d/1xw8r9pqC2fqJhMJs2QCTm8umTss9FEApyYPkIHmTAJI/edit?usp=sharing."
else
  firefox https://docs.google.com/presentation/d/1xw8r9pqC2fqJhMJs2QCTm8umTss9FEApyYPkIHmTAJI/edit?usp=sharing
fi
