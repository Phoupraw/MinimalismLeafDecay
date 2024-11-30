# Changelog
# 0.1.0
## New
### Block Tag
- `minimalism_leaf_decay:schedule_random`: Execute random tick after executing schedule tick
  - Defaultly contains `#leaves`
# 0.1.1
## New
### Block Tag
- `minimalism_leaf_decay:schedule_random_blacklist`: Blacklisit of Execute random tick after executing schedule tick
  - Where blocks won't execute random tick even if in `minimalism_leaf_decay:schedule_random`.
## Fix
- Remove unnecessary dependency.
- Revise links.
# 0.1.2
## Fix
- Leaves that don't neighbor other leaves won't fast decay.
# 0.2.0
## New
- Run command `/datapack disable "minimalism_leaf_decay:tags"` to disable this mod.
  - Run command `/datapack enable "minimalism_leaf_decay:tags"` to enable this mod.