# 更新日志
# 0.1.0
## 新增
### 方块标签
- `minimalism_leaf_decay:schedule_random`: 执行计划刻后执行随机刻
  - 默认包含`#leaves`
# 0.1.1
## 新增
### 方块标签
- `minimalism_leaf_decay:schedule_random_blacklist`: 执行计划刻后执行随机刻黑名单
  - 其中的方块即使在`minimalism_leaf_decay:schedule_random`中也不会执行随机刻。
## 修复
- 移除不必要的依赖。
- 修正链接。
# 0.1.2
## 修复
- 不与其他树叶相邻的树叶不会快速腐烂。
# 0.2.0
## 新增
- 执行指令`/datapack disable "minimalism_leaf_decay:tags"`可以直接关闭此模组。
  - 执行指令`/datapack enable "minimalism_leaf_decay:tags"`可以再次开启此模组。