def permutations(str):
  # Time complexity: O(n!)
  res = []
  if len(str) == 0:
    return [""]
  for char in str:
    sub_permutations = permutations(str.replace(char, ""))
    for sub in sub_permutations:
      res.append(char + sub)
  return res
