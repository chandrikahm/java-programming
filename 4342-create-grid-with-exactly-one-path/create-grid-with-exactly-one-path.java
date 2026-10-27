class Solution {
        public String[] createGrid(int m, int n) {
                char[][] grid = new char[m][n];
                        
                                // Step 1: Fill the entire grid with obstacles '#'
                                        for (int i = 0; i < m; i++) {
                                                    for (int j = 0; j < n; j++) {
                                                                    grid[i][j] = '#';
                                                                                }
                                                                                        }
                                                                                                
                                                                                                        // Step 2: Clear the top row (0, 0) to (0, n-1)
                                                                                                                for (int j = 0; j < n; j++) {
                                                                                                                            grid[0][j] = '.';
                                                                                                                                    }
                                                                                                                                            
                                                                                                                                                    // Step 3: Clear the last column (0, n-1) to (m-1, n-1)
                                                                                                                                                            for (int i = 0; i < m; i++) {
                                                                                                                                                                        grid[i][n - 1] = '.';
                                                                                                                                                                                }
                                                                                                                                                                                        
                                                                                                                                                                                                // Convert char[][] to String[]
                                                                                                                                                                                                        String[] result = new String[m];
                                                                                                                                                                                                                for (int i = 0; i < m; i++) {
                                                                                                                                                                                                                            result[i] = new String(grid[i]);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                    return result;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        }
